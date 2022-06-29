package basic1;

/**
 * @author shkstart
 * @create 2022-06-15-0:00
 */
public class Str {
    public static void main(String[] args) {
        String name = "你好，中国";
        String id = "610426200012344321";
        System.out.println(name.length());
        System.out.println(name.concat(id)+"    "+name+id);
//        格式化字符串
        String shi;
        shi = String.format("望月楼"+
                            "此去经年，应是良辰好景虚设"+
                            "离别，走便走了，便不回头，谁不想好好的来场告别呢？"
                );
        System.out.println(shi);
        System.out.println(id.charAt(5)+name.compareTo(id));
        System.out.println(id.endsWith("321"));


    }
}