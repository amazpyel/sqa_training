def count_word(searched_word, url):

    response = urllib2.urlopen(url)

    html = response.read()

    result = re.findall(searched_word, html, re.IGNORECASE)

    return len(result)
