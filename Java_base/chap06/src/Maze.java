// 迷宫游戏
public class Maze {

    public static void main(String[] args) {
        // 思路
        // 1. 用二维数组表示迷宫.
        // 2. 0 表示可以走 1 表示障碍物.
        int[][] map = new int[8][7];
        // 3. 第一行最后一行设为1.
        for(int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 4. 第一列和最后一列设为1.
        for(int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = map[3][2] = 1;
        // 测试回溯
        map[2][2] = 1; 
        
        MazeTools obj = new MazeTools();
        System.out.println("地图初始情况：");
        obj.printMap(map);
        System.out.println("=============");
        obj.findWay(map, 1, 1);
        obj.printMap(map);
        
        
    }
}

class MazeTools {

    /* 
     * 方法解读
     * (1) findWay方法用于寻找出迷宫路径.
     * (2) 如果找到,返回true，否则返回false.
     * (3) map为表示迷宫的二维数组.
     * (4) i, j为老鼠的位置，初始位置(1, 1), 终点(6, 5).
     * (5) 递归找路，0 表示没走过可以走 1 表示障碍物 2 表示测试过可以走 3 表示走过但走不通.
     * (6) 当map[6][5] = 2 时表示找到通路，退出.
     * (7) 找路策略：下右上左.
     */
    public boolean findWay(int[][] map, int i, int j) {
        if(map[6][5] == 2) {
            return true;
        } else {
            if(map[i][j] == 0) {
                map[i][j] = 2;
                if(findWay(map, i + 1, j)) {
                    return true;
                } else if(findWay(map, i, j + 1)) {
                    return true;
                } else if(findWay(map, i - 1, j)) {
                    return true;
                } else if(findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    // 修改找路策略：上右下左
    public boolean findWay2(int[][] map, int i, int j) {
        if(map[6][5] == 2) {
            return true;
        } else {
            if(map[i][j] == 0) {
                map[i][j] = 2;
                if(findWay2(map, i - 1, j)) {
                    return true;
                } else if(findWay2(map, i, j + 1)) {
                    return true;
                } else if(findWay2(map, i + 1, j)) {
                    return true;
                } else if(findWay2(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public void printMap(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}