package liquibase.ext.hibernate.snapshot;

import liquibase.logging.LogFactory;
import liquibase.logging.Logger;
import liquibase.structure.core.Column;
import liquibase.structure.core.Table;

/**
 * Created by abulgakov on 11.11.2015.
 */
public class Helper {
    private static final Logger logger = LogFactory.getLogger("liquibase-hibernate");

    public static Column getColumn(Object object, Table table) {
        org.hibernate.mapping.Column column = (org.hibernate.mapping.Column) object;
        String name = column.getName();
        Column keyColumn;// = table.getColumn(name);
        //if (keyColumn == null) {
        //    logger.warning("cannot find column " + name + " in table " + table.getName() + " has columns " + table.getColumns());
            keyColumn = new Column(name).setRelation(table);
        //}
        return keyColumn;
    }
}
