$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/rockpaperscissors/api/login/id"
    }).then(function(data) {
       $('.id').append(data.id);
       $('.date').append(data.date);
    });
});