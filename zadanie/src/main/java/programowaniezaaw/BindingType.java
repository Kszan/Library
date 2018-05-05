package programowaniezaaw;

public enum BindingType {

    SOFT_BINDING("M"),
    HARDCOVER("T");

    private final String type;

    BindingType(String s) {
        type = s;
    }

    public static BindingType findByType(String type){
        for(BindingType s : values()){
            if( s.type.equals(type)){
                return s;
            }
        }
        return null;
    }
}
