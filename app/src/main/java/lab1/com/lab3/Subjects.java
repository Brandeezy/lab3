package lab1.com.lab3;

/**
 * Created by Eokinyi on 10/23/2017.
 */

public class Subjects {
    //private variables
    int _cid;
    String _cname;

    public Subjects(){}
    public Subjects(int id, String name){
        this._cid = id;
        this._cname = name;
    }
    public Subjects(String name){
        this._cname = name;
    }

    public int getSID() {
        return _cid;
    }

    public void setSID(int _cid) {
        this._cid = _cid;
    }

    public String getSName() {
        return _cname;
    }

    public void setSName(String _cname) {
        this._cname = _cname;
    }

}
