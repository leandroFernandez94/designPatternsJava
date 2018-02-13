package estructurales.Flyweight;

/**
 * Created by leandro on 7/2/17.
 */

class Factory {
    private Gazillion[] pool;

    public Factory(int maxRows) {
        pool = new Gazillion[maxRows];
    }

    public Gazillion getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Gazillion(row);
        }
        return pool[row];
    }
}
