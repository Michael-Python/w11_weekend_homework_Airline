public enum PlaneType {
//    Data taken from https://modernairliners.com/boeing-747-jumbo/boeing-747-specs/
    BOEING747_100(452, 333400);
//    BOEING747_SP(331, 304000),
//    BOEING747_200(452, 374850),
//    BOEING747_300(496, 374850),
//    BOEING747_400(524, 396890);

    private final int capacity;
    private final int allowedWeight;

    PlaneType(int capacity, int allowedWeight){
        this.capacity = capacity;
        this.allowedWeight = allowedWeight;
    };

    public int getCapacity(){
        return this.capacity;
    }

    public int getAllowedWeight(){
        return this.allowedWeight;
    }

}
