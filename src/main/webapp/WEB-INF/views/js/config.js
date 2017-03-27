require.config({
    baseUrl: '/js',
    paths: {
        'jquery': 'lib/jquery-1.12.3.min',
        'bootstrap': 'lib/bootstrap/js/bootstrap.min',
        'html5shiv': 'lib/bootstrap/js/html5shiv.min',
        'respond': 'lib/bootstrap/js/respond.min',
        'laydate': 'lib/laydate/laydate',
        'layer': 'lib/layer/layer',
        'handlebars': 'lib/handlebars-1.0.0',
        'jquery.pagination': 'lib/pagination/jquery.pagination',
        'jquery.validate': 'lib/validate/jquery.validate.min',
        'jquery.placeholder': 'lib/jquery.placeholder',
        'jquery.ui': 'lib/jquery-ui',
        'jquery.serialize': 'lib/jquery.serialize-object.min',
        'ztree': 'lib/zTree/jquery.ztree.core.min',
        'ztree.excheck': 'lib/zTree/jquery.ztree.excheck.min'
    },
    shim: {
        'bootstrap': {
            deps: ['jquery', 'html5shiv.min', 'respond.min', 'lib/css!lib/bootstrap/css/bootstrap.min.css']
        },
        'layery1': {
            deps: ['jquery']
        },
        'pagination': {
            deps: ['jquery', 'lib/css!lib/pagination/pagination.css']
        },
        'laydate': {
            deps: ['jquery']
        },
        'ztree': {
            deps: ['jquery']
        },
        'ztree.excheck': {
            deps: ['jquery', 'ztree']
        }
    }
});
