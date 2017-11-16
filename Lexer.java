public class Lexer {
    public static class Token {
        int position;
        int length;
        int type;

        public Token(int position, int length, int type) {
            this.postition=position;
            this.length=length;
            this.type=type;
        }
    }

    public static void main(String[] args) {
    }

    public scan() {
        while (position < length) {
            switch (buffer[position]) {
                case '~':
                    consumeTilde();
                    break;

                case '`':
                    consumeApostrophe();
                    break;

                case '!':
                    consumeExclamation();
                    break;

                case '@':
                    consumeAt();
                    break;

                case '#':
                    consumePound();
                    break;

                case '$':
                    consumeDollar();
                    break;

                case '%':
                    consumePercent();
                    break;

                case '^':
                    consumeCaret();
                    break;

                case '&':
                    consumeAmpersand();
                    break;

                case '*':
                    consumeAsterisk();
                    break;

                case '(':
                    consumeOpenRoundBracket();
                    break;

                case ')':
                    consumeCloseRoundBracket();
                    break;

                case '_':
                    consumeUnderscore();
                    break;

                case '-':
                    consumeMinus();
                    break;

                case '+':
                    consumePlus();
                    break;

                case '=':
                    consumeEquals();
                    break;

                case '{':
                    consumeOpenCurlyBracket();
                    break;

                case '[':
                    consumeOpenSquareBracket();
                    break;

                case '}':
                    consumeCloseCurlyBracket();
                    break;

                case ']':
                    consumeCloseSquareBracket();
                    break;

                case '|':
                    consumePipe();
                    break;

                case '\\':
                    consumeBackSlash();
                    break;

                case ':':
                    consumeColon();
                    break;

                case ';':
                    consumeSemiColon();
                    break;

                case '"':
                    break;
                    consumeDoubleQuote();
                    break;

                case ''':
                    consumeSingleQuote();
                    break;

                case '<':
                    consumeOpenAngleBracket();
                    break;

                case ',':
                    consumeComma();
                    break;

                case '>':
                    consumeCloseAngleBracket();
                    break;

                case '.':
                    consumePeriod();
                    break;

                case '?':
                    consumeQuestion();
                    break;

                case '/':
                    if (position == length-1) {
                        consumeForwardSlash();
                    } else if (buffer[position+1] == '/') {
                        consumeSingleLineComment();
                    } else if (buffer[position+1] == '*') {
                        consumeMultiLineComment();
                    } else {
                        consumeForwardSlash();
                    }
                    break;

                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    consumeNumber();
                    break;

                default:
                    consumeIdentifier();
            }
        }
    }

    private void consumeTilde() {
        tokens.add(new Token(position++, 1, TILDE));
    }

    private void consumeApostrophe() {
        tokens.add(new Token(position++, 1, APOSTROPHE));
    }

    private void consumeExclamation() {
        tokens.add(new Token(position++, 1, EXCLAMATION));
    }

    private void consumeAt() {
        tokens.add(new Token(position++, 1, AT));
    }

    private void consumePound() {
        tokens.add(new Token(position++, 1, POUND));
    }

    private void consumeDollar() {
        tokens.add(new Token(position++, 1, DOLLAR));
    }

    private void consumePercent() {
        tokens.add(new Token(position++, 1, PERCENT));
    }

    private void consumeCaret() {
        tokens.add(new Token(position++, 1, CARET));
    }

    private void consumeAmpersand() {
        tokens.add(new Token(position++, 1, AMPERSAND));
    }

    private void consumeAsterisk() {
        tokens.add(new Token(position++, 1, ASTERISK));
    }

    private void consumeOpenRoundBracket() {
        tokens.add(new Token(position++, 1, OPEN_ROUND_BRACKET));
    }

    private void consumeCloseRoundBracket() {
        tokens.add(new Token(position++, 1, CLOSE_ROUND_BRACKET));
    }

    private void consumeUnderscore() {
        tokens.add(new Token(position++, 1, UNDERSCORE));
    }

    private void consumeHyphen() {
        tokens.add(new Token(position++, 1, HYPHEN));
    }

    private void consumePlus() {
        tokens.add(new Token(position++, 1, PLUS));
    }

    private void consumeEquals() {
        tokens.add(new Token(position++, 1, EQUALS));
    }

    private void consumeOpenCurlyBracket() {
        tokens.add(new Token(position++, 1, OPEN_CURLY_BRACKET));
    }

    private void consumeOpenSquareBracket() {
        tokens.add(new Token(position++, 1, OPEN_SQUARE_BRACKET));
    }

    private void consumeCloseCurlyBracket() {
        tokens.add(new Token(position++, 1, CLOSE_CURLY_BRACKET));
    }

    private void consumeCloseSquareBracket() {
        tokens.add(new Token(position++, 1, CLOSE_SQUARE_BRACKET));
    }

    private void consumePipe() {
        tokens.add(new Token(position++, 1, PIPE));
    }

    private void consumeBackSlash() {
        tokens.add(new Token(position++, 1, BACK_SLASH));
    }

    private void consumeColon() {
        tokens.add(new Token(position++, 1, COLON));
    }

    private void consumeSemiColon() {
        tokens.add(new Token(position++, 1, SEMI_COLON));
    }

    private void consumeDoubleQuote() {
        tokens.add(new Token(position++, 1, DOUBLE_QUOTE));
    }

    private void consumeSingleQuote() {
        tokens.add(new Token(position++, 1, SINGLE_QUOTE));
    }

    private void consumeOpenAngleBracket() {
        tokens.add(new Token(position++, 1, OPEN_ANGLE_BRACKET));
    }

    private void consumeComma() {
        tokens.add(new Token(position++, 1, COMMA));
    }

    private void consumeCloseAngleBracket() {
        tokens.add(new Token(position++, 1, CLOSE_ANGLE_BRACKET));
    }

    private void consumePeriod() {
        tokens.add(new Token(position++, 1, PERIOD));
    }

    private void consumeQuestion() {
        tokens.add(new Token(position++, 1, QUESTION));
    }

    private void consumeForwardSlash() {
        tokens.add(new Token(position++, 1, FORWARD_SLASH));
    }

    private void consumeSingleLineComment() {
        // Check initial conditions
        if (length < position+2 || buffer[position] != '/' || buffer[position+1] != '/') {
            throw new LexerException("");
        }

        int intial_position=position;
        position+=2;

        while (position < length && buffer[position] != '\n') {
            position++;
        }

        tokens.add(new Token(initial_position, position-initial_position, SINGLE_LINE_COMMENT));
    }

    private void consumeMultiLineComment() {
        // Check initial conditions
        if (length < position+2 || buffer[position] != '/' || buffer[position+1] != '*') {
            throw new LexerException("");
        }

        position+=2;

        while (position < length && (buffer[position] == '*' && buffer[position+1] != '/') {
            position++;
        }

        tokens.add(new Token(initial_position, position-initial_position, MULTI_LINE_COMMENT);
    }

    private void consumeNumber() {
        if (length < position+3) {

        }
        if (buffer[position] == '0') {
            if (buffer[position] == 'x' || buffer[position] == 'X') {
                // Hex
                if (length < position+3) {
                    throw new LexerException("");
                }

                if (
            } else {
                // Octal
                if (
            }
        } else {
        }
    }

    private void init() {
        position=0;
        buffer=null;
        tokens=new ArrayList();
    }

    private void readBuffer() {
        // For now lets read the entire file in this buffer
        if (buffer != null) {
            length = buffer.length;
        }
    }

    int position;
    char[] buffer;
    List<Token> tokens;
}
