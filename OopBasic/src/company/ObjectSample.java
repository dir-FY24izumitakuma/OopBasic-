package company;

public class ObjectSample {

    public static void main(String[] args) {
     // インスタンスの作成
        var salesDepartment =new Department("営業部", "xx", 1000000);
        Employee sales= new Sales("鈴木", salesDepartment, "課長", 100);

        // インスタンスメソッドの呼び出し
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        //1行空ける
        System.out.println("");
        
        // インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88,"java");//変更

        // インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developsoftware();
        
        System.out.println("");
        
        //ポリモーフィズムの確認
        Employee projectManager=new Engineer("佐藤",devDepartment,"PM",99,"Java");
        
        //インスタントメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            //developsoftwareメソッドを呼び出す
            ((Engineer)projectManager).developsoftware();
        }
        
        System.out.println("");
        
        //アルバイトインスタンスの作成
        var parttimeWorker=new ParttimeWorker("太田", salesDepartment);
        
        //実装したメソッドの呼び出し
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
                
    }

}