import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "loja")
public class Loja
{   
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String nome;
    
    @DatabaseField
    public int registration;
    
    //@DatabaseField(dataType=DataType.DATE)
    //public Date birthday;    
    
    /* public String printBirthday() {
        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
        return dateFor.format(birthday);
    } */

//Start GetterSetterExtension Source Code

    /**GET Method Propertie id*/
    public int getId(){
        return this.id;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(int id){
        this.id = id;
    }//end method setId

    /**GET Method Propertie fullName*/
    public String getName(){
        return this.nome;
    }//end method getFullName

    /**SET Method Propertie fullName*/
    public void setFullName(String nome){
        this.nome = nome;
    }//end method setFullName

    /**GET Method Propertie registration*/
    public int getRegistration(){
        return this.registration;
    }//end method getRegistration

    /**SET Method Propertie registration*/
    public void setRegistration(int registration){
        this.registration = registration;
    }//end method setRegistration

    /**GET Method Propertie birthday*/
    /* public Date getBirthday(){
        return this.birthday;
    }*/ //end method getBirthday

    /**SET Method Propertie birthday*/
    /* public void setBirthday(Date birthday){
        this.birthday = birthday;
    }*/ //end method setBirthday

//End GetterSetterExtension Source Code


}//End class