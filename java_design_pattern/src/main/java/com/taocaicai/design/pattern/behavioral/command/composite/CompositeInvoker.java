package com.taocaicai.design.pattern.behavioral.command.composite;

import java.util.ArrayList;

public class CompositeInvoker implements AbstractCommand {
  ArrayList<AbstractCommand> commandArrayList = new ArrayList<>();

  public void add(AbstractCommand abstractCommand) {
    commandArrayList.add(abstractCommand);
  }

  public void remove(AbstractCommand abstractCommand) {
    commandArrayList.remove(abstractCommand);
  }

  public AbstractCommand getChild(int i) {
    return commandArrayList.get(i);
  }

  @Override
  public void execute() {
    commandArrayList.forEach(abstractCommand -> abstractCommand.execute());
  }
}
