var Bob = function() {};

// helper function
function looksLikeRegEx (input, regex) {
	if (input.match(regex) != null) {
		return true;
	}
	else {
		return false;
	}
} 

function looksLikeShouting (input) {
	//find strings that use ALLCAPS, symbols and numbers and that might end with a !
	result = looksLikeRegEx(input, '^[^a-z.]+\\s+[^a-z.]*') || looksLikeRegEx(input, '[^a-z.]+!$');
	//make sure a string of numbers isn't mistaken for shouting
	if (result && looksLikeRegEx(input, '[^0-9,\\s]+'))
		return result
	else {
		return false
	}
}

function looksLikeAQuestion (input) {
	//regex looks for strings that end with a ?
	return looksLikeRegEx(input, '\\?$');
}

function looksLikeSilence (input) {
	//regex looks for only white space or empty string
	return (looksLikeRegEx(input, '^\\s+$') || input == '')
}

Bob.prototype.hey = function(input) {
	//Bob's default response
	lackadaisacal_response = 'Whatever.';

	if (looksLikeShouting(input)) {
		lackadaisacal_response = 'Whoa, chill out!'
	}
	else if (looksLikeAQuestion(input)) {
		lackadaisacal_response = 'Sure.';
	} 
	else if (looksLikeSilence(input)) {
		lackadaisacal_response = 'Fine. Be that way!';
	}

	return lackadaisacal_response;
};



module.exports = Bob;
