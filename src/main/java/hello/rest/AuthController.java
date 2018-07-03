package hello.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AuthController {

    private long cookieVal = (long) (Math.random() * Long.MAX_VALUE/2);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handle(Exception ex,
                                         HttpServletRequest request, HttpServletResponse response) {
        if (ex instanceof NullPointerException) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @RequestMapping(value = "/auth/register", method = RequestMethod.POST)
    public ResponseEntity<hello.rest.User> register(@RequestBody hello.rest.User user, HttpServletResponse response) {
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        System.out.println(user);

        if ( (user.getType().equals("buyer") || user.getType().equals("seller"))
                & user.getEmail().contains("@")
                & user.getName().length() >= 4
                & user.getPasswd().length() >= 4) {

            final Cookie cookie = new Cookie("commi", String.valueOf(cookieVal++));
            //cookie.setHttpOnly(true);
            response.addCookie(cookie);

            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public ResponseEntity<hello.rest.User> login(@RequestBody hello.rest.User user, HttpServletResponse response) {
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        System.out.println(user);

        if ( user.getEmail().contains("@")
                & user.getPasswd().length() >= 4) {

            final Cookie cookie = new Cookie("commi", String.valueOf(cookieVal++));
            //cookie.setHttpOnly(true);
            response.addCookie(cookie);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
