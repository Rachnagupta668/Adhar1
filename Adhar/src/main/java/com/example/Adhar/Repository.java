package com.example.Adhar;

import java.util.HashMap;

@org.springframework.stereotype.Repository
public class Repository {


    HashMap<Long,String> map = new HashMap<>();


    public void saveAdhar(Long id, String name) {
        map.put(id,name);
    }

    public String  getnamebyId(Long id) {
        if(map.containsKey(id))
        return map.get(id);

        return "Not Found";
    }
}
