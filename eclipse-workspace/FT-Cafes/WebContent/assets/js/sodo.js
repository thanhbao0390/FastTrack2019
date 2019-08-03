$(document).ready(function () {



    $("#sodo_btnAdd").on("click", function (e) {

        let form = $("#sodo_modalAdd form").serialize();
        let link = $("#sodo_modalAdd form").attr("action");

        $.ajax({
            method: "POST",
            url: link,
            data: form,
            dataType: 'json',
        })
            .done(function (data) {
                $('#sodo_modalAdd').modal("hide");
                $('.modal-backdrop').remove();
                $('body').removeClass("modal-open");
                refresh("#contents", "sodo", "GET", "");
            })
            .fail(function (error) {
                console.log(error);
            });
    });



});