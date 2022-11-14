package HomeWork.task7;

public class RobotAssembler implements RobotMaker{
    BodyPlant[] bodyParts = BodyPlant.values();
    HeadPlant[] headParts = HeadPlant.values();
    Robot[] robotArr = new Robot[9];

    @Override
    public void assembleFullRobot() {
        int k = 0;
        for (int i = 0; i < headParts.length; i++) {
            for (int j = 0; j < bodyParts.length; j++) {
                robotArr[k] = new Robot(Robot.generateName(), headParts[i].headName.toString(), bodyParts[j].bodyName.toString());
                k++;
            }
        }
    }

    @Override
    public void showRobots(){
        for (int i = 0; i < robotArr.length; i++) {
            System.out.println("Робот " + i + ": ");
            System.out.println("Имя - " + robotArr[i].getName());
            System.out.println("Голова - " + robotArr[i].getHead());
            System.out.println("Тело - " + robotArr[i].getBody());
            System.out.println();
        }
    }
}
