package Task_3;

/**
 * Генерик класс, в котором присваиваются значения переменным и результату вычисления
 */
public class Variables<T> {

    /**
     * X - 1 переменная
     * Y - 2 переменная
     * Answer - Результат вычисления
     */
    T x;
    T y;
    T answer;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getA() {
        return answer;
    }

    public void setA(T answer) {
        this.answer = answer;
    }
}
