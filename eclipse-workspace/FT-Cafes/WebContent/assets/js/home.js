


// menu navbar
$(".navbar-parent").on("click", function (e) {
	var target = $(e.currentTarget).attr("target_tag");
	$(".navbar-chilrd").hide();
	$("#" + target).show();
});

// link navbar chilrd
$(".navbar-chilrd li").on("click", function (e) {
	var link = $(e.currentTarget).attr("href");

	$.ajax({
		method: "GET",
		url: link,
		data: {}
	})
		.done(function (resp) {
			$("#contents").html(resp);
		})
		.fail(function (resp) {
			console.log(error);
		});
});

function refresh(target, link, method, data) {
	$.ajax({
		method: method,
		url: link,
		data: data
	})
		.done(function (resp) {
			$(target).html(resp);
		})
		.fail(function (error) {
			console.log(error);
		});
}

window.refresh = refresh;