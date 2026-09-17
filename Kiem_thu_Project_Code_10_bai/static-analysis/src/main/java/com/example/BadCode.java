package com.example;

public class BadCode {
    // Static-analysis practice code: intentionally contains issues to inspect.
    private static final String PASSWORD = "123456";

    public int divide(String inputA, String inputB) {
        int a = Integer.parseInt(inputA);
        int b = Integer.parseInt(inputB);

        if (b == 0) {
            return 0;
        }

        try {
            return a / b;
        } catch (Exception e) {
            return 0;
        }
    }

    public String getStatus(int score) {
        String result = "";
        if (score >= 50) {
            result = "PASS";
        } else {
            result = "FAIL";
        }
        return result;
    }

    public void printPassword() {
        System.out.println(PASSWORD);
    }
}
