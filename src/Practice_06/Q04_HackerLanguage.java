package Practice_06;

public class Q04_HackerLanguage {
    //    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline
    //    çeviren bir method(method ismi hackerDili) yazınız.
    //    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar.
    //    Genellikle çevirdikleri harfler şu şekilde:
    //    s -> 5
    //    a -> 4
    //    e -> 3
    //    i -> 1
    //    o -> 0
    //    Test data
    //    hackerDili("java ile hersey guzel")
    //    j4v4 1l3 h3r53y guz3l
    //    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {

        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};

        System.out.println("elemanSayisi(arr) = " + elemanSayisi(arr));

    }

    public static int elemanSayisi(int[][] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) { // output for
            for (int j = 0; j < arr[i].length; j++) { // inner for
                count++;

            }
        }
        return count;
    }
}
