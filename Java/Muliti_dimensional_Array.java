class MD_array {
    public static void main(String args[]){

        int [][] x = {{10, 9, 6, 14}, {140, 280, 340}};


        for(int i = 0; i < x.length; ++i){
            for(int j = 0; j < x[i].length; ++j){
                System.out.printf(" %d ", x[i][j]);
            }
            System.out.println();
        }

    }
}