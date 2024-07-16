import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

public class LojaRepository
{
    private static Database database;
    private static Dao<Loja, Integer> dao;
    private List<Loja> loadedStudents;
    private Loja loadedStudent; 
    
    public LojaRepository(Database database) {
        LojaRepository.setDatabase(database);
        loadedStudents = new ArrayList<Loja>();
    }
    
    public static void setDatabase(Database database) {
        LojaRepository.database = database;
        try {
            dao = DaoManager.createDao(database.getConnection(), Loja.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Loja.class);
        }
        catch(SQLException e) {
            System.out.println(e);
        }            
    }
    
    public Loja create(Loja loja) {
        int nrows = 0;
        try {
            nrows = dao.create(loja);
            if ( nrows == 0 )
                throw new SQLException("Error: object not saved");
            this.loadedStudent = loja;
            loadedStudents.add(loja);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return loja;
    }    

    public void update(Loja loja) {
      // TODO
    }

    public void delete(Loja loja) {
      // TODO
    }
    
    public Loja loadFromId(int id) {
        try {
            this.loadedStudent = dao.queryForId(id);
            if (this.loadedStudent != null)
                this.loadedStudents.add(this.loadedStudent);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedStudent;
    }    
    
    public List<Loja> loadAll() {
        try {
            this.loadedStudents =  dao.queryForAll();
            if (this.loadedStudents.size() != 0)
                this.loadedStudent = this.loadedStudents.get(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedStudents;
    }

    // getters and setters ommited...        
}