package ssm.dao;

import org.apache.ibatis.annotations.Select;
import ssm.Traveller;

import java.util.List;

public interface ITravellersDao {
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
