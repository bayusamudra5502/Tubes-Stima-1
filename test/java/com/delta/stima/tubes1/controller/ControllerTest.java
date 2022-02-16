package com.delta.stima.tubes1.controller;

import com.delta.stima.tubes1.analyzer.PowerupsCollector;
import com.delta.stima.tubes1.entities.GameState;
import org.junit.jupiter.api.Test;

public class ControllerTest {
    @Test
    public void testAddController() {
        Controller ctr = new Controller();
        ctr.addAnalyzer(new PowerupsCollector(new GameState()));
    }
}