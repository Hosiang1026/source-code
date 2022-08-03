package com.code;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        hashMap.put("k1","v1");
        hashMap.put("k2","v2");
        hashMap.put("k3","v3");
        hashMap.put("k4","v4");
        hashMap.put("k5","v5");
        Object k2 = hashMap.get("k2");
        System.out.printf(k2.toString());
    }
}
