/*
 * This file is generated by jOOQ.
 */
package database.generated.tables;


import database.generated.DefaultSchema;
import database.generated.Keys;
import database.generated.tables.records.EpochsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Epochs extends TableImpl<EpochsRecord> {

    private static final long serialVersionUID = -64587100;

    /**
     * The reference instance of <code>epochs</code>
     */
    public static final Epochs EPOCHS = new Epochs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpochsRecord> getRecordType() {
        return EpochsRecord.class;
    }

    /**
     * The column <code>epochs.id</code>.
     */
    public final TableField<EpochsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>epochs.started_at</code>.
     */
    public final TableField<EpochsRecord, Timestamp> STARTED_AT = createField(DSL.name("started_at"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>epochs.completed_at</code>.
     */
    public final TableField<EpochsRecord, Timestamp> COMPLETED_AT = createField(DSL.name("completed_at"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>epochs.term_id</code>.
     */
    public final TableField<EpochsRecord, Integer> TERM_ID = createField(DSL.name("term_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>epochs</code> table reference
     */
    public Epochs() {
        this(DSL.name("epochs"), null);
    }

    /**
     * Create an aliased <code>epochs</code> table reference
     */
    public Epochs(String alias) {
        this(DSL.name(alias), EPOCHS);
    }

    /**
     * Create an aliased <code>epochs</code> table reference
     */
    public Epochs(Name alias) {
        this(alias, EPOCHS);
    }

    private Epochs(Name alias, Table<EpochsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Epochs(Name alias, Table<EpochsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Epochs(Table<O> child, ForeignKey<O, EpochsRecord> key) {
        super(child, key, EPOCHS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<EpochsRecord> getPrimaryKey() {
        return Keys.PK_EPOCHS;
    }

    @Override
    public List<UniqueKey<EpochsRecord>> getKeys() {
        return Arrays.<UniqueKey<EpochsRecord>>asList(Keys.PK_EPOCHS, Keys.SQLITE_AUTOINDEX_EPOCHS_1, Keys.SQLITE_AUTOINDEX_EPOCHS_2, Keys.SQLITE_AUTOINDEX_EPOCHS_3);
    }

    @Override
    public Epochs as(String alias) {
        return new Epochs(DSL.name(alias), this);
    }

    @Override
    public Epochs as(Name alias) {
        return new Epochs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Epochs rename(String name) {
        return new Epochs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Epochs rename(Name name) {
        return new Epochs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}