package chat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController("/aserv")
public class TheController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/aserv/say")
    public SaySomething something(@RequestParam(value="name", defaultValue="World") String name) {
        return new SaySomething(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/aserv/blip")
    public Blip blip(@RequestParam(value="name", defaultValue="defaultBip") String name) {
        return new Blip(counter.incrementAndGet());
    }
}
