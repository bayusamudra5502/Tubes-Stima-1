package com.delta.stima.tubes1.controller;

import java.util.List;

import com.delta.stima.tubes1.analyzer.BaseAnalyzer;
import com.delta.stima.tubes1.command.Command;
import com.delta.stima.tubes1.command.DoNothingCommand;

public class Controller {
  private List<BaseAnalyzer> analyzersList;

  public void addAnalyzer(BaseAnalyzer analyzer) { 
    this.analyzersList.add(analyzer);
  }

  public Command nextAction() {
    for(int i = 0; i < analyzersList.size(); i++){
      BaseAnalyzer analyzer = analyzersList.get(i);
      if(analyzer.isSolutionExist()){
        return analyzer.getSolution();
      }
    }

    return new DoNothingCommand();
  }
}
