package com.example.room;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static List<ClassRoom> rooms = new ArrayList<>();

    static{
        for(int i=0;i<4;i++){
            rooms.add(new ClassRoom(i, "Name " + i, i, "DataSci"));
        }
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}
