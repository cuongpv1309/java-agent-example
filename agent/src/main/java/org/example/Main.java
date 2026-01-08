package org.example;

import java.lang.instrument.Instrumentation;

public class Main {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("=== Hello World Java Agent ===");
        System.out.println("Agent args: " + agentArgs);
        System.out.println("Instrumentation available: " + (inst != null));
    }

}