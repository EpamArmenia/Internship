package com.epam.namehasher;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {

            String name;
            do {
                System.out.println("Please enter your name: ");
                name = in.readLine();
            }
            while(name == null || name.equals(""));

            String hash = hashMyName(name.toUpperCase());
            System.out.println(hash);
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
    }

    public static String hashMyName(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
}
