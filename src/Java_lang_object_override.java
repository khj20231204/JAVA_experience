public class Java_lang_object_override {

    private String name;

    public Java_lang_object_override(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Java_lang_object_override){
            if(this.name.equals(((Java_lang_object_override) obj).name)){
                return true;
            }
        }
        return false;
    }
}
