package brokenrobotgame.model;

import brokenrobotgame.model.navigation.CellPosition;

/*
 * Battery - �������� �������, ������� ����� �������� ������ �����������
 */
public class Battery {

    // ---------------- ����� ����������� �������, ������ � ��� �������� -----------------
    
    private boolean _isDestroy = false;     // ������� �������� �������������
    
    // ���������� �������
    public void destroy(){
	_amount�f�harge = 0;
	_isDestroy = true;
    }
    
    // ------------------- ������������� ����� � ������� ����� -----------------
    private GameField _field;

    // ----------------------- ������� � ����� ������� -------------------------
    private int _chargeCapacity = 100;                  // ������� � �������� �������� 
    private int _amount�f�harge = _chargeCapacity;      // ����� � �������� �������� 

    
    public Battery(GameField field, int capacity, int amount) {
        // TODO ����������, ���� ����� ������ �������
        
        _field = field;
        _chargeCapacity = capacity;
        _amount�f�harge = amount;
    }

    public int chargeCapacity(){
        // TODO ����������, ���� ������� ����������
        return _chargeCapacity;
    }
    
    public int amount�f�harge(){
        // TODO ����������, ���� ������� ����������
        return _amount�f�harge;
    }
	
    public void reduceCharge(int delta){
        // TODO ����������, ���� ������� ����������

        // TODO ����������, ���� delta �� �������������
        
	_amount�f�harge -= delta;
	if(_amount�f�harge < 0) 	_amount�f�harge = 0;
    }
	
    
    // ----------------------- ������� ��������� -------------------------
    
    CellPosition _position;                             // �������
    
    public CellPosition position(){
        // TODO ����������, ���� ������� ����������

        return _position;
    }
    
    boolean setPosition(CellPosition pos){
    
        boolean success = false;
        
        if(pos == null)                         // ��������� ��� ����
        {
            _position = null;
            success = true;
        }
        else if(_field.battery(pos)!= null)     // ������� ��� ������ ������ ����������
        {
            success = false;
        }
        else                                    // ������� ��������
        {
            _position = pos;
            success = true;
        }
        
        return success;
    }
}
