package example;

public class PersonDto {

    /**
     * 名前
     */
    private String name;

    /**
     * 年齢
     */
    private String age;

    /**
     * 名前を取得します。
     * 
     * <p>
     * 初期値はnullです
     * </p>
     * 
     * @return 名前を返します。
     */
    public String getName() {
        return name;
    }

    /**
     * 名前を設定します。
     * 
     * @param name
     *            名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年齢を取得します。
     * 
     * <p>
     * 初期値はnullです
     * </p>
     * 
     * @return 年齢を返します。
     */
    public String getAge() {
        return age;
    }

    /**
     * 年齢を設定します。
     * 
     * @param age
     *            年齢
     */
    public void setAge(String age) {
        this.age = age;
    }

}
