package publicpackage.dao;

import publicpackage.domain.ExampleDomain;

/**
 * Created by xavimo on 2018/1/11.
 */
public interface ExampleDAO {
    ExampleDomain selectByPK(Integer id);
}
