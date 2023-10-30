package brokenrobotgame.model;

import brokenrobotgame.model.navigation.MiddlePosition;
import brokenrobotgame.model.navigation.CellPosition;
import java.util.ArrayList;


/*
 * GameField - ���������� ����, ���������� �� �����;  
 * ��������� ��� ������� ������ (������, ���� � ��������)
 */
public class GameField {

    // ------------------------------ ������� ---------------------------
	
    public GameField (){
    
        setSize(10, 10);
    }
        
    public final void setSize(int width, int height) {
        CellPosition.setHorizontalRange(1, width);
        CellPosition.setVerticalRange(1, height);
    }

    public int width() {
        return CellPosition.horizontalRange().length();
    }

    public int height() {
        return CellPosition.verticalRange().length();
    }
	
    // ---------------------------- ����� ----------------------------

    !!!
    
    public Robot robot(){
        !!!
    }
    
    !!!
	
    // ---------------------------- ����� ----------------------------

    private ArrayList<WallPiece> _wallPool = new ArrayList();   // �����

    public boolean isWall(MiddlePosition pos){
        
        for (WallPiece obj : _wallPool)
        {
            if(obj.position().equals(pos))  return true;
        }
        
        return false;
    }
    
    public boolean addWall(MiddlePosition pos, WallPiece obj){
        
        boolean success = obj.setPosition(pos);
        
        if(success) _wallPool.add(obj);
        
        return success;
    }

    // ---------------------------- ����� ----------------------------

    private ArrayList<Door> _doorPool = new ArrayList();        // �����

    public Door door(MiddlePosition pos){
        
        for (Door obj : _doorPool)
        {
            if(obj.position().equals(pos))  return obj;
        }
        
        return null;
    }
    
    public boolean addDoor(MiddlePosition pos, Door obj){
        
        boolean success = obj.setPosition(pos);
        
        if(success) _doorPool.add(obj);
        
        return success;
    }
    
    // ---------------------------- ��������� ----------------------------
    
    private ArrayList<Battery> _batteryPool = new ArrayList();  // ���������

    public Battery battery(CellPosition pos){
        
        for (Battery obj : _batteryPool)
        {
            if(obj.position().equals(pos))  return obj;
        }
        
        return null;
    }
	
    public boolean addBattery(CellPosition pos, Battery obj){
        
        boolean success = obj.setPosition(pos);
        
        if(success) _batteryPool.add(obj);
        
        return success;
    }
    
    public boolean removeBattery(Battery obj){
        
        boolean success = _batteryPool.remove(obj);
        
        if(success) obj.setPosition(null);
        
        return success;
    }
    
    // ---------------------------- ������� ----------------------------
    
    public void clear()
    {
        !!!
        _wallPool.clear();
        _batteryPool.clear();
    }
}