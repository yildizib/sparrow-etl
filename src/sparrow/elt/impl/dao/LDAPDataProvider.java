package sparrow.elt.impl.dao;

import sparrow.elt.core.config.SparrowConfig;
import sparrow.elt.core.config.SparrowDataExtractorConfig;
import sparrow.elt.core.config.SparrowDataProviderConfig;
import sparrow.elt.core.context.SparrowContext;
import sparrow.elt.core.dao.impl.QueryObject;
import sparrow.elt.core.dao.impl.RecordSet;
import sparrow.elt.core.dao.provider.DataProvider;

/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
public class LDAPDataProvider implements DataProvider{

  protected final SparrowContext context;
  private String name = null;
  protected QueryObject query = null;

  /**
     *
     * @param config
     *            SparrowDataProviderConfig
     */
    public LDAPDataProvider(SparrowDataProviderConfig config) {
      this((SparrowConfig) config);
    }

    /**
     *
     * @param config
     *            SparrowDataExtractorConfig
     */
    public LDAPDataProvider(SparrowDataExtractorConfig config) {
      this((SparrowConfig) config);
    }

    /**
     *
     * @param config SparrowConfig
     */
    public LDAPDataProvider(SparrowConfig config) {
        this.context = config.getContext();
        this.name = config.getName();

     }



  /**
   * clone
   *
   * @return Object
   */
  public Object clone() {
    return "";
  }

  /**
   * destory
   */
  public void destory() {
  }

  /**
   * getData
   *
   * @return RecordSet
   */
  public RecordSet getData() {
    return null;
  }

  /**
   * getName
   *
   * @return String
   */
  public String getName() {
    return this.name;
  }

  /**
   * getQuery
   *
   * @return QueryObject
   */
  public QueryObject getQuery() {
    throw new UnsupportedOperationException("getQuery method is not supported by LDAPDataProvider");
  }

  /**
   * initialize
   */
  public void initialize() {
  }

  /**
   * executeQuery
   *
   * @return int
   */
  public int executeQuery() {
    throw new UnsupportedOperationException("executeQuery method is not supported by LDAPDataProvider");
  }
}
