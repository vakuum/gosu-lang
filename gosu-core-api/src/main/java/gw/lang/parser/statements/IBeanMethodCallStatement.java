/*
 * Copyright 2014 Guidewire Software, Inc.
 */

package gw.lang.parser.statements;

import gw.lang.parser.IStatement;
import gw.lang.parser.expressions.IBeanMethodCallExpression;

public interface IBeanMethodCallStatement extends IStatement
{
  IBeanMethodCallExpression getBeanMethodCall();
}
