package org.restudios.relang.parser.ast.types.nodes.expressions;

import org.restudios.relang.parser.ast.types.nodes.Expression;
import org.restudios.relang.parser.ast.types.values.Context;
import org.restudios.relang.parser.ast.types.values.values.Value;
import org.restudios.relang.parser.tokens.Token;

public class GroupingExpression extends Expression {
    public final Expression expression;

    public GroupingExpression(Token token, Expression expression) {
        super(token);
        this.expression = expression;
    }

    @Override
    public Value eval(Context context) {
        return expression.eval(context);
    }
}
