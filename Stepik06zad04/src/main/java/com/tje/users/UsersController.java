package com.tje.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class UsersController {

    @GetMapping("/")
    public String home(Model model) throws ParseException {
        String startDateString = "20/05/2007 07:32";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date startDate = df.parse(startDateString);
        User user = new User(2, "Artur", 36, User.UserType.ADMIN, startDate);
        model.addAttribute("user", user);
        return "home";
    }

    @GetMapping("/list")
    public String list(Model model) throws ParseException {
        ArrayList<User> users = new ArrayList<User>();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        users.add(new User(1, "Taylor Swift", 30, User.UserType.ADMIN, df.parse("1989-12-13 09:15")));
        users.add(new User(2, "Bruno Mars", 25, User.UserType.GUEST, df.parse("2023-02-15 11:30")));
        users.add(new User(3, "Adele", 22, User.UserType.REGISTERED, df.parse("2000-03-25 14:45")));
        users.add(new User(4, "Kendrick Lamar", 40, User.UserType.REGISTERED, df.parse("2023-04-10 16:20")));
        users.add(new User(5, "Ed Sheeran", 28, User.UserType.GUEST, df.parse("2023-05-20 10:00")));
        users.add(new User(6, "The Weekend", 35, User.UserType.GUEST, df.parse("2022-06-30 12:30")));
        users.add(new User(7, "Maryla Rodowicz", 666, User.UserType.REGISTERED, df.parse("1410-07-11 18:15")));
        users.add(new User(8, "Olivia Rodrigo", 20, User.UserType.REGISTERED, df.parse("2023-09-11 17:30")));
        users.add(new User(9, "Lady Gaga", 25, User.UserType.REGISTERED, df.parse("2023-02-15 16:45")));
        users.add(new User(10, "Dua Lipa", 24, User.UserType.REGISTERED, df.parse("2010-04-10 15:50")));

        model.addAttribute("users", users);
        return "list";
    }
}
