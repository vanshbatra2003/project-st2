// public class rat{
//     public static void ratinmaze(int sr,int er,int sc,int ec,String answer,boolean[][] isVisited){
//         if(sr<0 ||sc<0||sr>er||sc>ec||isVisited[sr][sc]){
//             return;
//         }
//         if(sr==er &&sc==ec){
//             System.out.println(answer);
//             return;
//         }
//         isVisited[sr][sc]=true;
//         ratinmaze(sr, er, sc-1, ec, answer+"l", isVisited);
//         ratinmaze(sr, er, sc+1, ec, answer+"r", isVisited);
//         ratinmaze(sr-1, er, sc, ec, answer+"u", isVisited);
//         ratinmaze(sr+1, er, sc, ec, answer+"d", isVisited);
//         isVisited[sr][sc]=false;
//     }
//     public static void main(String[] args) {
//         int rows=3;
//         int cols=3;
//         boolean[][] isVisited=new boolean[rows][cols];
//         ratinmaze(0,rows-1,0,cols-1,"",isVisited);
//     }
// }



public class rat{

    public static int rat(int sr,int er,int sc,int ec,String ans,boolean [][] isVisited){
        if(sr<0||sc<0||sr>er||sc>ec||isVisited[sc][sc]){
            return;
        }
        if(sr==er && sc==rc){
            System.out.println(ans);
            return;
        }
        isVisited[sr][sc]=true;
        rat(sr, er, sc, ec, ans, isVisited)
    }
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        boolean[][]isVisited=new boolean[rows][cols];
        rat(cols, cols, rows, cols, null, isVisited)
    }
}