/**
 * @description:
 * @author:
 * @date: 2021/5/29 22:34
 * @version:1.0
 */

public class LISTTEST {
    public static void main(String[] args) {
        LinkListTest ls=new LinkListTest();
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.deletenode(ls,1);
        ls.printnode(ls);
    }
}
