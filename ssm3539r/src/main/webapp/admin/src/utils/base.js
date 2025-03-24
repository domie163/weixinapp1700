const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm3539r/",
            name: "ssm3539r",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm3539r/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的小微金融企业的设计与实现"
        } 
    }
}
export default base
