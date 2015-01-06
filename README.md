boot-midje
==========
[![Clojars](https://img.shields.io/badge/clojars-%5Bzilti%2Fboot--typed%20%220.1.0%22%5D-blue.svg?style=flat)](https://clojars.org/zilti/boot-midje)

`[zilti/boot-midje "0.0.1-SNAPSHOT"]`

A Boot task allowing you to conveniently use Midje with your Boot projects. Currently this is just a rudimentary hack,
but pretty much everything lein-midje does should work. For autotesting, use "boot watch midje".

<pre>
Options:
  -h, --help                 Print this help info.
  -t, --test-path TESTPATH   Conj TESTPATH onto additional paths where the test files reside.
  -n, --namespace NAMESPACE  Conj NAMESPACE onto symbols of the namespaces to run tests in.
  -f, --filter FILTER        Conj FILTER onto midje filters.
  -c, --config CONFIG        Conj CONFIG onto list of midje config files.
</pre>
