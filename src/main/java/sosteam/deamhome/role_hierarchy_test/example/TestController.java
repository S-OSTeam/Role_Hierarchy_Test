package sosteam.deamhome.role_hierarchy_test.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @PreAuthorize("hasRole('USER')")
    @GetMapping()
    public String test() {

        return "test";
    }
}
