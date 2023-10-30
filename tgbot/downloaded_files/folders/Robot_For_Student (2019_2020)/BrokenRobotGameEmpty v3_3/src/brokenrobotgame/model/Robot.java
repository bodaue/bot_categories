package brokenrobotgame.model;

import brokenrobotgame.model.events.RobotActionEvent;
import brokenrobotgame.model.events.RobotActionListener;
import brokenrobotgame.model.navigation.Direction;
import brokenrobotgame.model.navigation.MiddlePosition;
import brokenrobotgame.model.navigation.CellPosition;
import java.util.ArrayList;


/*
 * Robot - ����� ������������� �� ����, ���� ������� ����� ���������� ���������; 
 * ��������������  ����������, ���� ����� ������; ����� ������������ ���������, 
 * ����������� � ����
 */
public class Robot
{
    // ------------------- ������������� ����� � ������� ����� -----------------
    !!!
	
  
    // ------------------- ����� "��������" �� ��������� � ����� �� ������ -----------------
    
    !!!

    public void useBattery(){
        
        // ����� ��������� ������ ���������� ����� � ������� ��� ���� ��� ����
        !!!if()
        {
            // TODO �������� ����������
        } 
               
        // ���������� ������ ���������
	!!!
        
        // ��������� ��������� � ������
        !!!
        
        // ���������� �������
        !!!        
    }
	
    public int amount�f�harge(){
	!!!
    }

    public int chargeCapacity(){
	!!!
    }
    
    protected void reduceCharge(int delta){
        !!!
    }
	
    
    // ------------------- ����� ����� ��������� � ��������� ����� -----------------
    
    public void openCloseDoor(Direction direct){
    
        if(amount�f�harge() > 0)    // ����� ������ ����� �����
        {
            !!!if()    // ����� ������� �����
            {
                // ������� ��� ������� �����
                !!!
                        
                // ���������� �����
                reduceCharge(1);

                // ���������� �������
                !!!
            }
        }    
    }
    
    // ------------------- ������� ������ -----------------

    private CellPosition _position;
    
    public CellPosition position(){
        return _position;
    }
    
    protected boolean setPosition(CellPosition pos){
        _position = pos;
        return true;
    }
	

    // ------------------- ������� ������ -----------------
        
    public void makeMove(Direction direct){

        if(amount�f�harge() > 0)    // ����� ������ ����� �����
        {
            if(moveIsPossible(direct)) // ������ ���� ���� ������ � ��� ������ �� ������
            { 
                // ������������ � ������ ������
                setPosition(position().next(direct));
                // ���������� �����
                reduceCharge(1);

                // ���������� �������
                !!!
            }
        }    
    }
    
    private boolean moveIsPossible(Direction direct){

        // ���� ��� �����������
        if(!position().hasNext(direct))     return false;

        MiddlePosition nextMiddlePos = new MiddlePosition(position(), direct);        
        
        // ����������� �����
        !!!if()    return false;

        // ����������� �������� �����
        !!!if()    return false;
        
        return true;
    }
    
    // ---------------------- ��������� ������� -----------------------------
    
    !!!
    
    // ������������ ���������
    public void addRobotActionListener(RobotActionListener l) { 
        !!! 
    }
    
    // ����������� ���������
    public void removeRobotActionListener(RobotActionListener l) { 
        !!!
    } 
    
    // ��������� ���������� � �������
    protected void fireRobotAction() {
        !!!
    } 
}