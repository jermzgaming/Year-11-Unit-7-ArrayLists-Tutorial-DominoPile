public class Domino {
    private int top;
    private int bottom;

    public Domino() {
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }

    public void flip(){
        int a = top;
        top = bottom;
        bottom = a;
    }

    public void settle() {
        if (bottom < top) {
            flip();
        }
    }

    public int compareTo(Domino other) {
        settle();
        other.settle();
        if (top < other.getTop()) {
            return -1;
        }
        else if (top > other.getTop()) {
            return 1;
        }
        else if (top == other.getTop()) {
            if (bottom < other.getBottom()) {
                return -1;
            }
            else if (bottom > other.getBottom()) {
                return 1;
            }
            else if (bottom == other.getBottom()){
                return 0;
            }
        }
        return 0;
    }

    public int compareToWeight(Domino other) {
        int a = top + bottom;
        int b = other.getTop() + other.getBottom();
        if (a < b) {
            return -1;
        }
        else if (a > b) {
            return 1;
        }
        return 0;
    }

    public boolean canConnect(Domino other) {
        if (bottom == other.getTop()) {
            return true;
        } else return top == other.getTop() || top == other.getBottom() || bottom == other.getBottom();
    }
}
