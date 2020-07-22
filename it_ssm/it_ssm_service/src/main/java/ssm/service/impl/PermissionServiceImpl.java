package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.Permission;
import ssm.Product;
import ssm.dao.IPermissionsDao;
import ssm.service.IPermissionService;
import ssm.service.IProductService;

import java.util.List;

@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    private IPermissionsDao permissionsDao;

    @Override
    public List<Permission> findAll() throws Exception {
        return permissionsDao.findAll() ;
    }

    @Override
    public void save(Permission permission) throws Exception {
        permissionsDao.save(permission);
    }
}
