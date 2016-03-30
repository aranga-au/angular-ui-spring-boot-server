module.exports = function() {
    
    var client = './src/main/resources/client/';
    var server = './src/server/';
    var clientApp = client + 'app/';
    var root = './';
    var tmpAssets='./src/main/resources/tmp/'
    var buildRoot = './build';
    var buildDir =buildRoot+'/clientApp/'
    var temp = buildRoot+'/tmp/';
    var assetTemp = client+'tmp/';
    
    var bower = {
        json: require('./bower.json'),
        directory: './src/main/resources/client/bower_components/',
        ignorePath: '../../../../'
    };


    var config = {
        /**
         * File paths
         */
        // all javascript that we want to vet
        alljs: [
            './main/resources/**/*.js',
            './*.js'
        ],
        assetTemp:assetTemp,
        vetjs:['./src/main/resources/client/app/*.js'],
        build: buildDir,
        client: client,
        css: assetTemp+'styles.css',
        fonts: bower.directory + 'font-awesome/fonts/**/*.*',
        html: client + '**/*.html',
        htmltemplates: clientApp + '**/*.html',
        images: client + 'images/**/*.*',
        index: client + 'index.html',
        // app js, with no specs
        js: [
            clientApp + '**/*.module.js',
            clientApp + '**/*.js'
        ],
        jsOrder: [
            '**/app.module.js',
            '**/*.module.js',
            '**/*.js'
        ],
        less: client + 'styles/styles.less',
        root: root,
        server: server,
        source: 'src/',
        temp: temp,

        /**
         * optimized files
         */
        optimized: {
            app: 'sample-app.js', //same as index.html <!-- build:js js/sample-app.js --> line
            lib: 'libs.js'
        },

        /**
         * browser sync
         */
        browserReloadDelay: 1000,

        /**
         * template cache
         */
        templateCache: {
            file: 'templates.js',
            options: {
                module: 'app',
                root: 'app/',
                standalone: false
            }
        },

        /**
         * Bower and NPM files
         */
        bower: bower,
        packages: [
            './package.json',
            './bower.json'
        ],

       /**
         * Node settings
         */
        nodeServer: server + 'app.js',
        defaultPort: '8001'
    };

    /**
     * wiredep and bower settings
     */
    config.getWiredepDefaultOptions = function() {
        var options = {
            bowerJson: config.bower.json,
            directory: config.bower.directory,
            ignorePath: config.bower.ignorePath
        };
        return options;
    };


    return config;

};
