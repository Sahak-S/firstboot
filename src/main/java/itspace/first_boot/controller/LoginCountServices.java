package itspace.first_boot.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountServices {

    private int count;

    public void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
