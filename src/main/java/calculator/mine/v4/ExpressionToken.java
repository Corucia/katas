package calculator.mine.v4;

import calculator.mine.v4.expression.Expression;

public class ExpressionToken {
    
    private String token;
    private ExpressionParser parser;

    public ExpressionToken(ExpressionParser parser, String token) {
        this.parser = parser;
        this.token = token;
    }
    
    public Expression expression() {
        return parser.parse(token);
    }

    @Override
    public String toString() {
        return token;
    }

}
